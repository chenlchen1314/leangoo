package com.team6.leangoo.model;

import java.util.Date;
import javax.persistence.*;

public class Card {
    @Id
    @Column(name = "card_id")
    private Integer cardId;

    @Column(name = "card_name")
    private String cardName;

    @Column(name = "card_intro")
    private String cardIntro;

    @Column(name = "card_end_date")
    private Date cardEndDate;

    @Column(name = "card_start_date")
    private Date cardStartDate;

    @Column(name = "card_label")
    private String cardLabel;

    @Column(name = "card_workload")
    private Double cardWorkload;

    /**
     * @return card_id
     */
    public Integer getCardId() {
        return cardId;
    }

    /**
     * @param cardId
     */
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    /**
     * @return card_name
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * @param cardName
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     * @return card_intro
     */
    public String getCardIntro() {
        return cardIntro;
    }

    /**
     * @param cardIntro
     */
    public void setCardIntro(String cardIntro) {
        this.cardIntro = cardIntro;
    }

    /**
     * @return card_end_date
     */
    public Date getCardEndDate() {
        return cardEndDate;
    }

    /**
     * @param cardEndDate
     */
    public void setCardEndDate(Date cardEndDate) {
        this.cardEndDate = cardEndDate;
    }

    /**
     * @return card_start_date
     */
    public Date getCardStartDate() {
        return cardStartDate;
    }

    /**
     * @param cardStartDate
     */
    public void setCardStartDate(Date cardStartDate) {
        this.cardStartDate = cardStartDate;
    }

    /**
     * @return card_label
     */
    public String getCardLabel() {
        return cardLabel;
    }

    /**
     * @param cardLabel
     */
    public void setCardLabel(String cardLabel) {
        this.cardLabel = cardLabel;
    }

    /**
     * @return card_workload
     */
    public Double getCardWorkload() {
        return cardWorkload;
    }

    /**
     * @param cardWorkload
     */
    public void setCardWorkload(Double cardWorkload) {
        this.cardWorkload = cardWorkload;
    }
}