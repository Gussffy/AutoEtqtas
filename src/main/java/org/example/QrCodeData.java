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

    @Override
    public String toString() {
        return "Código do Produto: " + productCode + ", Data de Validade: " + expiryDate + ", Quantidade: " + quant;
    }
}
