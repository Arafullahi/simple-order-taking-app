package upwork.andri.simpleordertaking;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.dgreenhalgh.android.simpleitemdecoration.linear.DividerItemDecoration;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import upwork.andri.simpleordertaking.models.ItemOrder;
import upwork.andri.simpleordertaking.thirdparty.SimpleDividerItemDecoration;
import upwork.andri.simpleordertaking.ui.ItemOrderAdapter;

public class MainActivity extends AppCompatActivity {

    private Unbinder unbinder;

    @BindView(R.id.rv_item_order)
    protected RecyclerView mItemOrderRV;

    @OnClick(R.id.order_button) void order(){
        Log.d("TAG", "ORDER CLICKED");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);

        ItemOrderAdapter itemOrderAdapter = new ItemOrderAdapter(this, ItemOrder.createOrderItems());
        mItemOrderRV.setAdapter(itemOrderAdapter);
//        mItemOrderRV.addItemDecoration(new SimpleDividerItemDecoration(this));
        Drawable dividerDrawable = ContextCompat.getDrawable(this, R.drawable.line_divider);

        mItemOrderRV.addItemDecoration(new DividerItemDecoration(dividerDrawable));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
