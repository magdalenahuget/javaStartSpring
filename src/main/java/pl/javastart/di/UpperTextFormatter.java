package pl.javastart.di;

@Component
@Primary
public class UpperTextFormatter implements TextFormatter {
    @Override
    public String format(String originalText) {
        return originalText.toUpperCase();
    }
}
