package sv.com.catedra.www.catedradwf.controller;

import sv.com.catedra.www.catedradwf.entities.MesasEntity;
import sv.com.catedra.www.catedradwf.model.MesasModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@RequestMapping("mesas")
public class MesasController {
    MesasModel mesasModel = new MesasModel();

    @RequestMapping(value = "list", method = GET)
    public String listarMesas(ModelMap modelMap) {

        modelMap.addAttribute("listaMesas", mesasModel.listarMesas());
        return "mesas/listar";
    }

    @RequestMapping(value = "create", method = GET)
    public String nuevoMesa(Model model) {
        model.addAttribute("mesa", new MesasEntity());
        return "mesas/nuevo";
    }

    @RequestMapping(value = "create", method = POST)
    public String insertarMesa(@ModelAttribute("mesa") MesasEntity mesas, Model model, RedirectAttributes atributos) {
        if (mesasModel.insertarMesas(mesas) > 0) {
            atributos.addFlashAttribute("exito", "Mesa registrada exitosamente");
            return "redirect:/mesas/list";
        } else {
            model.addAttribute("mesas", mesas);
            return "mesas/nuevo";
        }
    }
}
