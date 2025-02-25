public class PantallaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle estadoGuardado) {
        super.onCreate(estadoGuardado);
        setContentView(R.layout.actividad_principal);

        // Botón para mostrar el primer fragmento
        findViewById(R.id.botonPrimerFragmento).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista) {
                mostrarFragmento(new FragmentoUno());
            }
        });

        // Botón para mostrar el segundo fragmento
        findViewById(R.id.botonSegundoFragmento).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista) {
                mostrarFragmento(new FragmentoDos());
            }
        });

        // Botón para mostrar el tercer fragmento
        findViewById(R.id.botonTercerFragmento).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista) {
                mostrarFragmento(new FragmentoTres());
            }
        });

        // Carga inicial del primer fragmento
        mostrarFragmento(new FragmentoUno());
    }

    // Método para mostrar fragmentos en el contenedor
    private void mostrarFragmento(Fragment fragmento) {
        FragmentManager administradorFragmentos = getSupportFragmentManager();
        administradorFragmentos.beginTransaction()
                .replace(R.id.contenedorFragmento, fragmento)
                .commit();
    }
}

// Clase del primer fragmento
public class FragmentoUno extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflador, @Nullable ViewGroup contenedor, @Nullable Bundle estadoGuardado) {
        // Infla el diseño del primer fragmento
        return inflador.inflate(R.layout.fragmento_uno, contenedor, false);
    }
}

// Clase del segundo fragmento
public class FragmentoDos extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflador, @Nullable ViewGroup contenedor, @Nullable Bundle estadoGuardado) {
        // Infla el diseño del segundo fragmento
        return inflador.inflate(R.layout.fragmento_dos, contenedor, false);
    }
}

// Clase del tercer fragmento
public class FragmentoTres extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflador, @Nullable ViewGroup contenedor, @Nullable Bundle estadoGuardado) {
        // Infla el diseño del tercer fragmento
        return inflador.inflate(R.layout.fragmento_tres, contenedor, false);
    }
}
