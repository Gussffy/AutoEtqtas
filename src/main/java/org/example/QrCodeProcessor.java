package org.example;

import java.util.*;

public class QrCodeProcessor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<QrCodeData> qrCodeList = new ArrayList<>();
        QrCodeExtractor extractor = new QrExtractorImpl();

        System.out.println("Escaneie os códigos QR. Digite 'sair' para finalizar. ");

        while (true) {
            String qrText = sc.nextLine();
            if (qrText.equalsIgnoreCase("sair")){
                break;
            }
            System.out.println(" Texto do QR Code: " + qrText);

            QrCodeData data = extractor.extractData(qrText);
            if (data != null) {
                String description = ProductStorage.getProductDescription(data.getProductCode());
                if (description != null) {
                    data.setDescription(description);
                    System.out.println("Descrição do Produto: " + description);
                } else {
                    System.out.println("Descrição não encontrada para o código do produto: " + data.getProductCode());
                }

                qrCodeList.add(data);
            } else {
                System.out.println("Falha ao extrair dados do QR Code.");
            }
        }
        System.out.println("QR Codes Extraídos:");
        for (QrCodeData data : qrCodeList) {
            System.out.println(data);
        }
        sc.close();

        // QRCODES para teste:
        // 010789103354150810BY35717281130303524054150
        // 010789103373613310BY34217271130303224073613
    }
}
