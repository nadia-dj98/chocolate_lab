package com.bnta.chocolate.services;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChocolateService {
    @Autowired
    ChocolateRepository chocolateRepository;

    @Autowired
    EstateRepository estateRepository;

    public ChocolateService(){
    }
    public List<Chocolate> getAllChocolates(){return chocolateRepository.findAll();}

    public List<Chocolate> getSingleChocolate(String name) {
        return chocolateRepository.findByName(name);
    }

    public List<Chocolate> getCocoaPercentage(int cocoaPercentage) {
        return chocolateRepository.findByCocoaPercentageGreaterThan(cocoaPercentage);
    }

}
