/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/Controller.java to edit this template
 */
package fpt.aptech.ParkingApplication.controller;

import fpt.aptech.ParkingApplication.configuration.RestTemplateConfiguration;
import fpt.aptech.ParkingApplication.domain.response.ProfileRes;
import java.util.Base64;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpClientErrorException;

/**
 *
 * @author CHIEN
 */
@Controller
public class ProfileController {

    private final String uri = "http://localhost:8080/";

    @Autowired
    private RestTemplateConfiguration restTemplate;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "view.name";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String getUser(Model model, HttpSession session) {
        try {
            String token = session.getAttribute("token").toString();
            HttpEntity request = restTemplate.setRequest(token);
            ResponseEntity<?> response = restTemplate.excuteRequest(uri + "user?token=" + token, HttpMethod.GET, request, ProfileRes.class);
            ProfileRes profileRes = (ProfileRes) response.getBody();

            StringBuilder sb = new StringBuilder();
            sb.append("data:image/png;base64,");
            sb.append(new String(Base64.getEncoder().encode(profileRes.getQrContent())));
            sb.toString();

            model.addAttribute("model", profileRes);
            model.addAttribute("displaycode", sb.toString());
            return "user/profile";
        } catch (Exception e) {
            return "badrequest";
        }
    }
//    @RequestMapping(value = "display-qrcode")
//    private String displayqrCode(byte[] content,HttpServletResponse response){
//        
//    }
}
