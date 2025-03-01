public class VideoFragment extends Fragment {
    // Declaración de los botones que permiten reproducir los videos
    private Button botonVideo1, botonVideo2;
    // Declaración de la vista de video que se utilizará para mostrar los videos
    private VideoView videoView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {
        // Infla el layout del fragmento (fragment_video.xml) y lo convierte en un objeto View
        View view = inflater.inflate(R.layout.fragment_video, container, false);
        // Encuentra los botones y el VideoView por su ID en el layout
        botonVideo1 = view.findViewById(R.id.buttonVideo1);
        botonVideo2 = view.findViewById(R.id.buttonVideo2);
        videoView = view.findViewById(R.id.videoView);
        // Configura el evento OnClickListener para el primer botón de video
        botonVideo1.setOnClickListener(v -> {
            // Reproduce el video correspondiente cuando se hace clic en el primer botón
            playVideo(R.raw.video1); // Reemplaza "video1" por el archivo de video que tengas
            en la carpeta raw
        });
        // Configura el evento OnClickListener para el segundo botón de video
        botonVideo2.setOnClickListener(v -> {
            // Reproduce el video correspondiente cuando se hace clic en el segundo botón
            playVideo(R.raw.video2); // Reemplaza "video2" por el archivo de video que tengas
            en la carpeta raw
        });

        // Devuelve la vista inflada para ser utilizada por el fragmento
        return view;
    }
    // Función que maneja la reproducción del video
    private void playVideo(int videoResId) {
        // Construye la ruta del video utilizando el identificador del recurso
        String videoPath = "android.resource://" + getActivity().getPackageName() + "/" +
                videoResId;
        // Convierte la ruta del video en un objeto Uri
        Uri uri = Uri.parse(videoPath);
        // Establece el URI del video en el VideoView
        videoView.setVideoURI(uri);
        // Comienza la reproducción del video
        videoView.start();
    }
} 
