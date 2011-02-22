/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Nyvang
 */
public class Movie {

    private int id;
    private String navn;
    private int aarstal;
    private String instruktion;
    private String skuespiller;
    private String skuespiller2;
    private String genre;

    public Movie(int id, String navn, int aarstal, String instruktion, String skuespiller, String skuespiller2, String genre) {
        this.id = id;
        this.navn = navn;
        this.aarstal = aarstal;
        this.instruktion = instruktion;
        this.skuespiller = skuespiller;
        this.skuespiller2 = skuespiller2;
        this.genre = genre;
    }

        /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Get the value of genre
     *
     * @return the value of genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Set the value of genre
     *
     * @param genre new value of genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    
    /**
     * Get the value of skuespiller2
     *
     * @return the value of skuespiller2
     */
    public String getSkuespiller2() {
        return skuespiller2;
    }

    /**
     * Set the value of skuespiller2
     *
     * @param skuespiller2 new value of skuespiller2
     */
    public void setSkuespiller2(String skuespiller2) {
        this.skuespiller2 = skuespiller2;
    }

    /**
     * Get the value of skuespiller
     *
     * @return the value of skuespiller
     */
    public String getSkuespiller() {
        return skuespiller;
    }

    /**
     * Set the value of skuespiller
     *
     * @param skuespiller new value of skuespiller
     */
    public void setSkuespiller(String skuespiller) {
        this.skuespiller = skuespiller;
    }

    
    
    /**
     * Get the value of Instruktion
     *
     * @return the value of Instruktion
     */
    public String getInstruktion() {
        return instruktion;
    }

    /**
     * Set the value of Instruktion
     *
     * @param Instruktion new value of Instruktion
     */
    public void setInstruktion(String instruktion) {
        this.instruktion = instruktion;
    }

    
    /**
     * Get the value of aarstal
     *
     * @return the value of aarstal
     */
    public int getAarstal() {
        return aarstal;
    }

    /**
     * Set the value of aarstal
     *
     * @param aarstal new value of aarstal
     */
    public void setAarstal(int aarstal) {
        this.aarstal = aarstal;
    }

    /**
     * Get the value of Navn
     *
     * @return the value of Navn
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Set the value of Navn
     *
     * @param Navn new value of Navn
     */
    public void setNavn(String navn) {
        this.navn = navn;
    }

}
