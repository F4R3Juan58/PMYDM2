public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Método que se ejecuta al crear la actividad. Es la inicialización principal.
        super.onCreate(savedInstanceState);
        // Establece el diseño asociado a la actividad, en este caso, activity_main.
        setContentView(R.layout.activity_main);

        // Declara un botón y lo vincula al botón en el diseño cuyo ID es IdpopUpMenu.
        Button btnPopupMenu = (Button) findViewById(R.id.IdpopUpMenu);

        // Asigna un evento de clic al botón btnPopupMenu.
        btnPopupMenu.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RestrictedApi")
            @Override
            public void onClick(View v) {
                // Crea un menú emergente (PopupMenu) vinculado al botón btnPopupMenu.
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, btnPopupMenu);

                // Infla el diseño del menú desde el archivo options_menu.xml.
                popupMenu.getMenuInflater().inflate(R.menu.options_menu, popupMenu.getMenu());

                // Hace visibles los íconos opcionales en el menú. Esto utiliza una clase interna de Android.
                ((MenuBuilder) popupMenu.getMenu()).setOptionalIconsVisible(true);

                // Define un listener para manejar la selección de elementos del menú emergente.
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        // Muestra un mensaje Toast indicando qué elemento del menú se seleccionó.
                        Toast.makeText(MainActivity.this, "Has pulsado " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true; // Indica que el evento de clic fue manejado.
                    }
                });
                // Muestra el menú emergente en la interfaz de usuario.
                popupMenu.show();
            }
        });
    }
