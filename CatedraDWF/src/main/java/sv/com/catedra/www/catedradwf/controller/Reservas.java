package sv.com.catedra.www.catedradwf.controller;

import sv.com.catedra.www.catedradwf.entities.ReservasEntity;
import sv.com.catedra.www.catedradwf.model.ReservasModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
@Controller
@RequestMapping("reservas")
public class ReservasController {
    ReservasModel reservasModel = new ReservasModel();
    @RequestMapping(value = "list", method = GET)
    public String listarReservas(ModelMap modelMap){

        modelMap.addAttribute("listaReservas",  reservasModel.listarReservas());
        return "reservas/listar";
    }
}

