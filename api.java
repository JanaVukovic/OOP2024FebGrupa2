import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class api extends Application{
    public static List<String> reci = new ArrayList<>();
    public static Map<String, Integer> takmicari = new HashMap<>();
    public static Character slovo;
    public static String rec;
    public static void main(String[] args) {
        try{
            Path ulaz = Paths.get("ZamisljeneReci.txt");
            List<String> linije = Files.readAllLines(ulaz);
            Random rand = new Random();
            int a = rand.nextInt();
            if(a < 0) a *= -1;
            System.out.println(linije.size() + " " + a);
            a %= (linije.size());
            String linija = linije.get(a);
            slovo = linija.charAt(0);
            String[] sve = linija.split(" ", 0);
            reci = Arrays.asList(sve);
            a = rand.nextInt();
            if(a < 0) a *= -1;
            rec = sve[a % sve.length];
            launch(args);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setPadding(new Insets(15, 15, 15, 15));
        Label lbSlovo = new Label("Ana je zamislila rec na slovo " + slovo);
        Label lbReci = new Label("Ana je zamislila neku od sledecih reci:");
        TextArea taReci = new TextArea();
        taReci.setEditable(false);
        Label lbIme = new Label("Ime takmicara:");
        Label lbUnos = new Label("Unesite rec:");
        TextField tfIme = new TextField();
        TextField tfUnos = new TextField();
        HBox hbIme = new HBox();
        HBox hbUnos = new HBox();
        hbIme.getChildren().addAll(lbIme, tfIme);
        hbUnos.getChildren().addAll(lbUnos, tfUnos);
        Label lbObavestenje = new Label();
        Button bPotvrdi = new Button("Potvrdi");
        Button bOcisti = new Button("Ocisti");
        Button bPrikazi = new Button("Prikazi");
        bPrikazi.setAlignment(Pos.CENTER);
        bOcisti.setAlignment(Pos.CENTER);
        bPotvrdi.setAlignment(Pos.CENTER);
        TextArea taIspis = new TextArea();
        taIspis.setEditable(false);
        root.getChildren().addAll(lbSlovo, lbReci, taReci, hbIme,hbUnos, lbObavestenje,bPotvrdi,bPrikazi, bOcisti, taIspis);
        StringBuilder sb = new StringBuilder();
        for(String a : reci){
            sb.append(a).append('\n');
        }
        taReci.setText(String.valueOf(sb));
        bPotvrdi.setOnAction(event ->{
            String ime = tfIme.getText();
            String unos = tfUnos.getText();
            if(ime == null || unos == null) return;
            if(takmicari.containsKey(ime)) {
                if (unos.equals(rec)) {
                    takmicari.put(ime, takmicari.get(ime) + 10);
                    lbObavestenje.setText("Pogodili ste rec!");
                } else {

                    takmicari.put(ime, takmicari.get(ime) - 3);
                    lbObavestenje.setText("Vise srece drugi put!");
                }
            }else{
                if (unos.equals(rec)) {
                    takmicari.put(ime, 10);
                    lbObavestenje.setText("Pogodili ste rec!");
                } else {

                    takmicari.put(ime, -3);
                    lbObavestenje.setText("Vise srece drugi put!");
                }
            }
        });
        bOcisti.setOnAction(event->{
            taIspis.setText("");
            lbObavestenje.setText("");
        });
        bPrikazi.setOnAction(event->{
            taIspis.setText("");
            for(Map.Entry<String, Integer> entry: takmicari.entrySet()){
                taIspis.appendText(entry.getKey() + " " + entry.getValue() + '\n');
            }
        });
        Scene scene = new Scene(root, 400, 800);
        stage.setScene(scene);
        stage.setTitle("Na slovo, na slovo");
        stage.show();
    }
}
