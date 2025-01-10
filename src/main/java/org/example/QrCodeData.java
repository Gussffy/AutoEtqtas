package org.example;

public class QrCodeData {

    String productCode;
    String expiryDate;
    String quant;

    QrCodeData(String productCode, String expiryDate, String quant) {
        this.productCode = productCode;
        this.expiryDate = expiryDate;
        this.quant = quant;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getQuant() {
        return quant;
    }

    public void setQuant(String quant) {
        this.quant = quant;
    }

    @Override
    public String toString() {
        return "Código do Produto: " + productCode + ", Data de Validade: " + expiryDate + ", Quantidade: " + quant;
    }
}
