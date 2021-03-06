/*
 * PDP FSP API (Implementation Friendly Version)
 * DRAFT FOR INTERNAL REVIEW ONLY - Based on API Definition.docx updated on 2017-07-06 - Implementation friendly version. [Changes from pervious version (2.7) - maxLength changed to 48 from 32 for IlpCondition and IlpFulfilment Types.]
 *
 * OpenAPI spec version: 2.8
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ilp.conditions.models.pdp;

import java.util.Objects;

/**
 * Below are the allowed values for the enumeration - RECEIVED Payee FSP has received the bulk transfer from the Payer FSP. - PENDING Payee FSP has validated the bulk transfer. - ACCEPTED Payee FSP has accepted to process the bulk transfer. - PROCESSING Payee FSP has started to transfer fund to the Payees. - COMPLETED Payee FSP has completed transfer of funds to the Payees. - REJECTED Payee FSP has rejected to process the bulk transfer.
 */
public enum BulkTransferState {
  
  RECEIVED("RECEIVED"),
  
  PENDING("PENDING"),
  
  ACCEPTED("ACCEPTED"),
  
  PROCESSING("PROCESSING"),
  
  COMPLETED("COMPLETED"),
  
  REJECTED("REJECTED");

  private String value;

  BulkTransferState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BulkTransferState fromValue(String text) {
    for (BulkTransferState b : BulkTransferState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

}
