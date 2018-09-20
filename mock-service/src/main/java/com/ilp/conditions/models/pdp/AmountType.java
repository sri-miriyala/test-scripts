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
 * Below are the allowed values for the enumeration AmountType - SEND Amount the Payer would like to send, that is, the amount that should be withdrawn from the Payer account including any fees. - RECEIVE Amount the Payer would like the Payee to receive, that is, the amount that should be sent to the receiver exclusive fees.
 */
public enum AmountType {
  
  SEND("SEND"),
  
  RECEIVE("RECEIVE");

  private String value;

  AmountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AmountType fromValue(String text) {
    for (AmountType b : AmountType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

}
