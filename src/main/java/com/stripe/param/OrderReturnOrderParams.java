// Generated by com.stripe.generator.entity.SdkBuilder

package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import com.stripe.param.common.EmptyParam;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

public class OrderReturnOrderParams extends ApiRequestParams {
  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /** List of items to return. */
  @SerializedName("items")
  Object items;

  private OrderReturnOrderParams(List<String> expand, Object items) {
    this.expand = expand;
    this.items = items;
  }

  public static Builder builder() {
    return new com.stripe.param.OrderReturnOrderParams.Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Object items;

    /** Finalize and obtain parameter instance from this builder. */
    public OrderReturnOrderParams build() {
      return new OrderReturnOrderParams(this.expand, this.items);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderReturnOrderParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * OrderReturnOrderParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /** List of items to return. */
    public Builder setItems(EmptyParam items) {
      this.items = items;
      return this;
    }

    /** List of items to return. */
    public Builder setItems(List<Item> items) {
      this.items = items;
      return this;
    }
  }

  public static class Item {
    /** The amount (price) for this order item to return. */
    @SerializedName("amount")
    Long amount;

    /** If returning a `tax` item, use description to disambiguate which one to return. */
    @SerializedName("description")
    String description;

    /** The ID of the SKU, tax, or shipping item being returned. */
    @SerializedName("parent")
    String parent;

    /** When type is `sku`, this is the number of instances of the SKU to be returned. */
    @SerializedName("quantity")
    Long quantity;

    /** The type of this order item. Must be `sku`, `tax`, or `shipping`. */
    @SerializedName("type")
    Type type;

    private Item(Long amount, String description, String parent, Long quantity, Type type) {
      this.amount = amount;
      this.description = description;
      this.parent = parent;
      this.quantity = quantity;
      this.type = type;
    }

    public static Builder builder() {
      return new com.stripe.param.OrderReturnOrderParams.Item.Builder();
    }

    public static class Builder {
      private Long amount;

      private String description;

      private String parent;

      private Long quantity;

      private Type type;

      /** Finalize and obtain parameter instance from this builder. */
      public Item build() {
        return new Item(this.amount, this.description, this.parent, this.quantity, this.type);
      }

      /** The amount (price) for this order item to return. */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /** If returning a `tax` item, use description to disambiguate which one to return. */
      public Builder setDescription(String description) {
        this.description = description;
        return this;
      }

      /** The ID of the SKU, tax, or shipping item being returned. */
      public Builder setParent(String parent) {
        this.parent = parent;
        return this;
      }

      /** When type is `sku`, this is the number of instances of the SKU to be returned. */
      public Builder setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
      }

      /** The type of this order item. Must be `sku`, `tax`, or `shipping`. */
      public Builder setType(Type type) {
        this.type = type;
        return this;
      }
    }

    public enum Type implements ApiRequestParams.EnumParam {
      @SerializedName("discount")
      DISCOUNT("discount"),

      @SerializedName("shipping")
      SHIPPING("shipping"),

      @SerializedName("sku")
      SKU("sku"),

      @SerializedName("tax")
      TAX("tax");

      @Getter(onMethod = @__({@Override}))
      private final String value;

      Type(String value) {
        this.value = value;
      }
    }
  }
}