public class MainActivity extends AppCompatActivity {

    Button sumitButtom;
    SeekBar simpleSeekBar;

    @Override
    protected void onCretae(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicio la vista
        simpleSeekBar = (SeekBar) findViewById(R.id.simpleSeekBar);

        //Realizo el ecento de escribir de cambio de baraa de busqueda utilizado
        //para obtener el valor
        simpleSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int progressChgangedValue = 0;

            public void onProgressChanged(SeekBar seekbar, int progress, boolean fromUser) {
                progressChangedValue = progress;
            }


            public void onStartTrackingTouch(SeekBar seekbar) {

            }

            public void onStopTrakingTouch(SeekBar seekbar) {
                Toast.makeTest(context MainActivity.this, text:
                "La seek bar es:" + progressChangedValue,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
