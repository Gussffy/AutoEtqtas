package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                qrCodeList.add(data);
            }else {
                System.out.println("Falha ao extrair dados do QR Code.");
            }
        }
        System.out.println("QR Codes Extraídos:");
        for (QrCodeData data : qrCodeList) {
            System.out.println(data);
        }
        sc.close();
    }
}
