Feature: Transaction Engine related functionality
  As a DFSP integrating with the hub
  I should be able to issue a quote targeted for the partner DFSP
  so that I can get the partner DFSP fee&commission

  #Refers to story: The sending DFSP directly queries the Receiving DFSP to check a transaction can be received
  Scenario: Sending DFSP issues a Quote request for the receiving DFSP
    Given Receiver "Alice" is resolved to "test-dfsp2" as part of lookup
    When "Bob" in "test-dfsp1" sends a quote to "Alice" in "test-dfsp2"
    Then "test-dfsp2" fees and commission should come back in the response

  Scenario:As a DFSP sending quote to the hub, I should be able to specify SENDING amount
    When Sending DFSP "dfsp1" sends a quote request with the SEND amount
    Then fees and commission should be returned

  Scenario:As a DFSP sending quote to the hub, I should be able to specify RECEIVING amount
    When Sending DFSP "dfsp1" sends a quote request with the RECEIVE amount
    Then fees and commission should be returned

  Scenario:As a DFSP I should be able to reverse a transaction
    Given A transfer was successful
    When Receiving DFSP initiates a reverse transaction
    Then Original amount less fees should be returned to sending DFSP

  Scenario:As a Receiving DFSP I should be able to refer original transaction in the reversal
    Given A transfer is successful
    When Receiving DFSP initiates a reverse transaction
    Then fees and commission should be returned