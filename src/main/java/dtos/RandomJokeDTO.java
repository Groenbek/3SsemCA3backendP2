/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

/**
 *
 * @author groen
 */
public class RandomJokeDTO {

    private String joke;

    public RandomJokeDTO(String joke) {
        this.joke = joke;
    }

    public RandomJokeDTO() {
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
    
}