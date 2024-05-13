package sv.com.catedra.www.catedradwf.controller;

import sv.com.catedra.www.catedradwf.entities.UsuariosEntity;
import sv.com.catedra.www.catedradwf.model.UsuariosModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
@Controller
@RequestMapping("usuarios")
public class UsuariosController {
    UsuariosModel usuariosModel = new UsuariosModel();

    @RequestMapping(value = "list", method = GET)
    public String listarUsuarios(ModelMap modelMap) {

        modelMap.addAttribute("listaUsuarios", usuariosModel.listarUsuario());
        return "usuarios/listar";
    }

    @RequestMapping(value = "create", method = GET)
    public String nuevoUsuario(Model model) {
        model.addAttribute("usuario", new UsuariosEntity());
        return "usuarios/nuevo";
    }

    @RequestMapping(value = "create", method = POST)
    public String insertarUsuario(@ModelAttribute("usuario") UsuariosEntity usuarios, Model model, RedirectAttributes atributos) {
        if (usuariosModel.insertarUsuarios(usuarios) > 0) {
            atributos.addFlashAttribute("exito", "Usuario registrado exitosamente");
            return "redirect:/usuarios/list";
        } else {
            model.addAttribute("usuarios", usuarios);
            return "usuarios/nuevo";
        }
    }
}
