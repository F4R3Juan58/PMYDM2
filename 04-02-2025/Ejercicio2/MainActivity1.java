public class MainActivity extends AppCompatActivity {
    // Declaración de los botones que permiten cambiar entre los fragmentos
    private Button botonVideoFragment, botonAudioFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Establece el layout de la actividad principal (activity_main.xml)
        setContentView(R.layout.activity_main);
        // Encuentra los botones en el layout por su ID
        botonVideoFragment = findViewById(R.id.botonVideoFragment);
        botonAudioFragment = findViewById(R.id.botonAudioFragment);
        // Cargar el primer fragmento por defecto (VideoFragment) al iniciar la actividad
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new VideoFragment()) // Reemplaza el
        contenido del FrameLayout con VideoFragment
                .commit(); // Realiza la transacción de fragmentos
        // Configura el evento OnClickListener para el botón de Video
        botonVideoFragment.setOnClickListener(v -> {
            // Reemplaza el contenido del FrameLayout con VideoFragment al presionar el
            botón
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new VideoFragment())
                    .commit();
        });
        // Configura el evento OnClickListener para el botón de Audio
        botonAudioFragment.setOnClickListener(v -> {
            // Reemplaza el contenido del FrameLayout con AudioFragment al presionar el
            botón
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new AudioFragment())
                    .commit();
        });
    }
} 
