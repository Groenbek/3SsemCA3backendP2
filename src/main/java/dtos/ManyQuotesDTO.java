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
public class ManyQuotesDTO {

    private String quote;

    public ManyQuotesDTO(String quote) {
        this.quote = quote;
    }

    public ManyQuotesDTO() {
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
    
}