package dio.experts.shoppingcart.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
public class Item {
    private Integer produtctId;
    private Integer amount;

    public Integer getProdutctId() {return produtctId;}

    public void setproductId(Integer produtctId) {this.produtctId = produtctId;}

    public Integer getAmount() {return amount;}

    public void setAmount(Integer amount) {this.amount = amount;}
}
