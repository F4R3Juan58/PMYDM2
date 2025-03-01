public class MainActivity extends AppCompatActivity {
    Button BotonDeArriba, BotonDeAbajo;
    @Override
    protected void onCreate(Bundle savedInstanceState) { // Método que se ejecuta al crear
        la actividad
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Asigna el diseño de la actividad
        // Obtención del identificador del botón 1 desde el XML
        BotonDeArriba = (Button) findViewById(R.id.simpleButton1);

        // Obtención del identificador del botón 2 desde el XML
        BotonDeAbajo = (Button) findViewById(R.id.simpleButton2);
        // Configuración del evento de clic para el botón 1
        BotonDeArriba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un objeto MediaPlayer con el archivo de sonido 'uno'
                MediaPlayer ring = MediaPlayer.create(MainActivity.this, R.raw.uno);
                ring.start(); // Reproduce el sonido
                // Muestra un mensaje emergente indicando que se reproduce el sonido
                Toast.makeText(getApplicationContext(), "Emitiendo sonido relajante",
                        Toast.LENGTH_LONG).show();
            }
        });
        // Configuración del evento de clic para el botón 2
        BotonDeAbajo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un objeto MediaPlayer con el archivo de sonido 'dos'
                MediaPlayer ring = MediaPlayer.create(MainActivity.this, R.raw.dos);
                ring.start(); // Reproduce el sonido
                // Muestra un mensaje emergente indicando que se reproduce el sonido
                Toast.makeText(getApplicationContext(), "Emitiendo sonido inquietante!",
                        Toast.LENGTH_LONG).show();
            }
        });
    } 
