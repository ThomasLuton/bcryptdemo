package co.simplon.stickmeAPI.controllers;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.stickmeAPI.dtos.GenerateDto;
import co.simplon.stickmeAPI.dtos.GenerateView;

@RestController
@RequestMapping("/generate")
public class GenerateControllers {

    @PostMapping
    public String generate(@RequestBody String password) {
	return BCrypt.hashpw(password, BCrypt.gensalt(10));
    }

    @PostMapping("/with-cost")
    public GenerateView generateWithCost(
	    @RequestBody GenerateDto inputs) {
	GenerateView view = new GenerateView();
	view.setSalt(BCrypt.gensalt(inputs.getCost()));
	view.setHash(BCrypt.hashpw(inputs.getPassword(),
		view.getSalt()));
	return view;
    }

}
