import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        productList = new ArrayList<>();

        // Añadir productos
        productList.add(new Product("Laptop", 1200.99, R.drawable.laptop));
        productList.add(new Product("Smartphone", 799.49, R.drawable.smartphone));
        productList.add(new Product("Headphones", 199.99, R.drawable.headphones));
        productList.add(new Product("Camera", 499.99, R.drawable.camera));
        productList.add(new Product("Watch", 149.99, R.drawable.watch));

        ProductAdapter adapter = new ProductAdapter(this, productList);
        gridView.setAdapter(adapter);

        // Manejar clics
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Product selectedProduct = productList.get(position);


                // Mostrar el nombre en un toast
                Toast.makeText(MainActivity.this, "Producto: " + selectedProduct.getName(), Toast.LENGTH_SHORT).show();

                // Mostrar el precio en otro toast
                Toast.makeText(MainActivity.this, "Precio: $" + selectedProduct.getPrice(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
