package com.example.demo.service;

import com.example.demo.model.Card;
import com.example.demo.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class CardService {
    private CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void addCard(Card card, HttpServletResponse response) {
        if (card.getId().length() == 16) {
            cardRepository.addCard(card);
        }
        else {
            response.setStatus(403);
        }
    }

    public List<Card> getCards() {
        return cardRepository.getCards();
    }
}
