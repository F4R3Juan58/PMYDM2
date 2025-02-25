public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular el botón y establecer Listener
        Button btnPopupMenu = findViewById(R.id.idpopUpMenu);
        btnPopupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear el PopupMenu
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, v);
                popupMenu.getMenuInflater().inflate(R.menu.options_menu, popupMenu.getMenu());

                // Listener para las opciones del menú
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        return onOptionsItemSelected(item);
                    }
                });

                // Mostrar el menú
                popupMenu.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        // Comprobamos los elementos del menú
        switch (id) {
            case R.id.action_change_font_size:
                Toast.makeText(this, "Cambiar tamaño de la fuente", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_change_theme:
                Toast.makeText(this, "Cambiar tema", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_reset_settings:
                Toast.makeText(this, "Resetear ajustes", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_about:
                Toast.makeText(this, "Sobre la aplicación", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_faq:
                Toast.makeText(this, "FAQ", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_contact_support:
                Toast.makeText(this, "Contacto para soporte", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_save_changes:
                Toast.makeText(this, "Guardar cambios", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_cancel:
                Toast.makeText(this, "Cancelar", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_delete:
                Toast.makeText(this, "Borrar", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.action_home:
                Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_back:
                Toast.makeText(this, "Volver", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_next:
                Toast.makeText(this, "Siguiente", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
