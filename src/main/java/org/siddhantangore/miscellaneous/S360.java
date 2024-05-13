package org.siddhantangore.miscellaneous;

import java.util.Arrays;

public class S360 {
    public static void main(String[] args) {
        String response = "191231110150524";
        handleFIRSSubmitResponse(response);
    }

    public static void handleFIRSSubmitResponse(String response) {

        String message = caseCreationResponse1(response);
        if (message.equalsIgnoreCase("success")) {
            System.out.println("Correct Message = " + response);
        } else {
            System.out.println("Wrong message");
        }
    }

    public static String caseCreationResponse1(String response) {

        String[] responseModel = response.trim().split("#");
        System.out.println("response model = " + Arrays.toString(responseModel));

        switch (responseModel[0]) {
            case "3":
                response = "A similar request is already open for this TID. Kindly try once the previous request is closed";
                break;
            case "4":
                response = "Equipment serial no. is blank. Kindly contact customer care";
                break;
            case "5":
                response = "Equipment is in de-installation stage. Kindly contact customer care";
                break;
            case "6":
                response = "Your request could not be processed due to some maintenance activity. Kindly contact customer care";
                break;
            case "7":
                response = "Please enter date in DD/MM/YYYY";
                break;
            case "8":
                response = "Paper roll count should be in digit only";
                break;
            case "9":
                response = "Your request could not be processed due to some maintenance activity. Kindly contact customer care";
                break;
            case "10":
                response = "Attachment name not provided. Kindly select the attachment name";
                break;
            case "11":
                response = "TID entered is invalid";
                break;
            case "-1":
                response = "Briefly unavailable for scheduled maintenance. Check back in a minute";
                break;
            case "-2":
                response = "Briefly unavailable for scheduled maintenance. Check back in a minute";
                break;
        }

        if (responseModel.length == 3) {
            if ("1".equals(responseModel[0])) {
                response = "success";
            } else {
                response = "No Response Found";
            }
        } else if (responseModel[0].length() == 2) {
            if ("2".equals(responseModel[0].substring(0, 1)) && "0".equals(responseModel[0].substring(1, 2))) {
                response = "Limit not set";
            } else {
                response = "We could not process";
            }
        }
        return response;

    }
}
