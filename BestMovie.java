
@Component
public class BestMovieService
{
    @Autowired
    public BestMovieService(Movie movie) {
        this.movie = movie;
    }
    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie) {
        this.movie = movie;
    }
    public Movie getBestMovie() {
        return movie;
    }