package com.bnta.chocolate.components;

import com.bnta.chocolate.ChocolateApplication;
import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    EstateRepository estateRepository;

    @Autowired
    ChocolateRepository chocolateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Estate estate1 = new Estate("BNTA", "Zimbabwe");
        Estate estate2 = new Estate("Nadia's Estate", "Algeria");
        Estate estate3 = new Estate("Fatimah's Estate", "India");


        Chocolate bounty = new Chocolate("Bounty", 80, estate1);
        Chocolate maltesers = new Chocolate("Maltesers", 20, estate2);
        Chocolate galaxy = new Chocolate("Galaxy", 40, estate3);

        estateRepository.save(estate1);
        estateRepository.save(estate2);
        estateRepository.save(estate3);

        chocolateRepository.save(bounty);
        chocolateRepository.save(maltesers);
        chocolateRepository.save(galaxy);



    }





}
