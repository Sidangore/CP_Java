package org.siddhantangore.miscellaneous;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class CalculateSha256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String amount = "1250", invoice = "", mrn = "898922", uid = "";

        System.out.println("Test Case ");
        /*System.out.println(getSaleRequestBody(amount, mrn, uid));
        System.out.println("\nRequest - Mcomm to Card Payment\n");
        System.out.println("\nResponse - Card Payment to Mcomm\n");
        System.out.println("\nResponse - Mcomm to Biller\n");
        System.out.println(getRequestBody(amount, invoice, mrn));
        System.out.println("\nRequest - Mcomm to Card Payment\n");
        System.out.println("\nResponse - Card Payment to Mcomm\n");
        System.out.println("\nResponse - Mcomm to Biller\n");*/

        System.out.println(getGrabPayGenerateQRRequestBody(amount, mrn, uid));
        System.out.println("\nRequest - Mcomm to Card Payment\n");
        System.out.println("\nResponse - Card Payment to Mcomm\n");
        System.out.println("\nResponse - Mcomm to Biller\n");
        /*System.out.println(getRequestBody(amount, invoice, mrn));
        System.out.println("\nRequest - Mcomm to Card Payment\n");
        System.out.println("\nResponse - Card Payment to Mcomm\n");
        System.out.println("\nResponse - Mcomm to Biller\n");*/
    }

    private static String getRequestBody(String amount, String invoice, String mrn) throws NoSuchAlgorithmException {
        System.out.println("GET TRANSACTION");
        System.out.println("Request - Biller to Mcomm");
        StringBuilder stringForCheckSum = new StringBuilder("CardTransactionget_transaction");
        stringForCheckSum.append(amount);
        stringForCheckSum.append(mrn);
        String checkSum = toHexString(getSha256(stringForCheckSum.toString()));

        return "{\"version\":\"2.0\",\"workflow\":\"CardTransaction\",\"tranType\":\"get_transaction\",\"uid\":\"\",\"txnDetails\":{\"amounts\":{\"amount\":" + amount + "},\"txnInfo\":{\"mrn\":\"" + mrn + "\",\"invoiceNo\":\"" + invoice + "\"},\"additionalParams\":{}},\"checksum\":\"" + checkSum + "\"}";
    }

    private static String getSaleRequestBody (String amount, String mrn, String uid) throws NoSuchAlgorithmException {
        System.out.println("GET SALE");
        System.out.println("Request - Biller to Mcomm");
        StringBuilder stringForCheckSum = new StringBuilder("CardTransactionsale");
        amount = amount + "00";
        stringForCheckSum.append(amount);
        stringForCheckSum.append(mrn);
        String checkSum = toHexString(getSha256(stringForCheckSum.toString()));

        return "{\"version\":\"2.0\",\"workflow\":\"CardTransaction\",\"tranType\":\"sale\",\"uid\":\"" + uid + "\",\"txnDetails\":{\"amounts\":{\"amount\":" + amount + "},\"txnInfo\":{\"mrn\":\"" + mrn + "\"},\"additionalParams\":{\"isQfpay\":true}},\"checksum\":\"" + checkSum + "\"}";
    }

    private static String getGrabPayGenerateQRRequestBody (String amount, String mrn, String uid) throws NoSuchAlgorithmException {
        System.out.println("GET GENERATE GRABPAY QR");
        System.out.println("Request - Biller to Mcomm");
        StringBuilder stringForCheckSum = new StringBuilder("DigitalTransaction");
        stringForCheckSum.append("grab_pay");
        stringForCheckSum.append(amount);
        stringForCheckSum.append(mrn);
        String checkSum = toHexString(getSha256(stringForCheckSum.toString()));
        return "{\"version\":\"2.0\",\"workflow\":\"DigitalTransaction\",\"tranType\":\"grab_pay\",\"uid\":\"" + uid + "\",\"txnDetails\":{\"amounts\":{\"amount\":" + amount + "},\"txnInfo\":{\"mrn\":\"" + mrn + "\"},\"additionalParams\":{\"isQfpay\":true}},\"checksum\":\""+ checkSum + "\"}";

    }

    public static byte[] getSha256(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return md.digest(input.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash) {
        BigInteger bi = new BigInteger(1, hash);
        StringBuilder hexString = new StringBuilder(bi.toString(16));

        while (hexString.length() < 64) {
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }
}


