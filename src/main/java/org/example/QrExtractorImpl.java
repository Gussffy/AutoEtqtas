package org.example;

public class QrExtractorImpl implements QrCodeExtractor {

    @Override
    public QrCodeData extractData(String qrtext) {
        QrCodeData qrCodeData = null;

        try {
            int indexOf17 = qrtext.indexOf("17");
            if (indexOf17 != -1 && qrtext.length() > indexOf17 + 18) {
                String expiryDate = qrtext.substring(indexOf17 + 2, indexOf17 + 8);
                expiryDate = expiryDate.substring(4) + "/" + expiryDate.substring(2,4) + "/" + expiryDate.substring(0,2);

                int indexOf30 = qrtext.indexOf("30", indexOf17 + 8);
                if (indexOf30 != -1 && qrtext.length() > indexOf30 + 2) {

                     String quantity = qrtext.substring(indexOf30 + 2, indexOf30 + 4).trim();
                     String productCode = qrtext.substring(qrtext.length() - 5);

                     qrCodeData = new QrCodeData (productCode, expiryDate, quantity);
                }
            }
        } catch (Exception e) {
            System.err.println( "Erro ao processar texto do QR Code:" + e.getMessage());
        }
        return qrCodeData;
    }
}
