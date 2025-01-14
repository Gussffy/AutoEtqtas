package org.example;

public class QrCodeData {
    String description;
    String productCode;
    String expiryDate;
    String quant;

    QrCodeData(String productCode, String expiryDate, String quant) {
        this.productCode = productCode;
        this.expiryDate = expiryDate;
        this.quant = quant;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {

        return "--------------------------------------" + "\n" +
                " Código do Produto: " + productCode + "\n" +
                " Desc: " + description + "\n" +
                " Validade: " + expiryDate + "\n" +
                " Quantidade " + quant + "\n" +
                "--------------------------------------";

    }
}
