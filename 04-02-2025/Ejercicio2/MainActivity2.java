public class AudioFragment extends Fragment {
    private Button botonAudio1, botonAudio2;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup
            container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_audio, container, false);
        botonAudio1 = view.findViewById(R.id.buttonAudio1);
        botonAudio2 = view.findViewById(R.id.buttonAudio2); 
        botonAudio1.setOnClickListener(v -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(getActivity(), R.raw.uno);
            mediaPlayer.start();
            Toast.makeText(getActivity(), "Reproduciendo Audio 1",
                    Toast.LENGTH_SHORT).show();
        });
        botonAudio2.setOnClickListener(v -> {
            MediaPlayer mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dos);
            mediaPlayer.start();
            Toast.makeText(getActivity(), "Reproduciendo Audio 2",
                    Toast.LENGTH_SHORT).show();
        });
        return view;
    }
} 
