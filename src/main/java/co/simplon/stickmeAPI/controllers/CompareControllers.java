package co.simplon.stickmeAPI.controllers;

import java.nio.charset.StandardCharsets;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.stickmeAPI.dtos.CompareDto;
import co.simplon.stickmeAPI.dtos.CompareView;

@RestController
@RequestMapping("/compare")
public class CompareControllers {

    @PostMapping
    public CompareView compare(
	    @RequestBody CompareDto inputs) {
	CompareView view = new CompareView();
	view.setHashToCompare(inputs.getHashToCompare());
	view.setHashFromCandidate(inputs.getCandidate()
		.getBytes(StandardCharsets.UTF_8));
	view.setMatch(BCrypt.checkpw(inputs.getCandidate(),
		inputs.getHashToCompare()));
	return view;
    }

}
