package com.stripe.model;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.net.ApiResource;
import org.junit.jupiter.api.Test;

public class ChargeOutcomeTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getResourceAsString("/api_fixtures/charge_outcome.json");
    final Charge.Outcome object = ApiResource.GSON.fromJson(data, Charge.Outcome.class);
    assertNotNull(object);
    assertNotNull(object.getNetworkStatus());
  }
}
