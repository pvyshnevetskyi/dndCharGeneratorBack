package com.example.dndCharCreator.controller;

import com.example.dndCharCreator.entity.Character;
import com.example.dndCharCreator.repository.CharacterRepo;
import com.example.dndCharCreator.service.CharacterService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/character")
@CrossOrigin
public class CharacterController {

    private final CharacterService characterService;
    private final Logger logger = LoggerFactory.getLogger(CharacterController.class);

    @PostMapping
    public void save(@RequestBody Character object) {

//        characterService.save(character);

        logger.debug("{} saved", object);
    }
}
