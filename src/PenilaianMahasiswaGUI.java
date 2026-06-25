import javax.swing.*;
import java.awt.event.*;

public class PenilaianMahasiswaGUI extends JFrame {

    JLabel lblNama, lblNim, lblTugas, lblUTS, lblUAS;
    JTextField txtNama, txtNim, txtTugas, txtUTS, txtUAS;
    JButton btnHitung;
    JTextArea hasil;

    public PenilaianMahasiswaGUI() {

        setTitle("Program Penilaian Mahasiswa");
        setSize(450, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        lblNama = new JLabel("Nama Mahasiswa");
        lblNama.setBounds(30, 30, 120, 25);
        add(lblNama);

        txtNama = new JTextField();
        txtNama.setBounds(170, 30, 200, 25);
        add(txtNama);

        lblNim = new JLabel("NIM");
        lblNim.setBounds(30, 70, 120, 25);
        add(lblNim);

        txtNim = new JTextField();
        txtNim.setBounds(170, 70, 200, 25);
        add(txtNim);

        lblTugas = new JLabel("Nilai Tugas");
        lblTugas.setBounds(30, 110, 120, 25);
        add(lblTugas);

        txtTugas = new JTextField();
        txtTugas.setBounds(170, 110, 200, 25);
        add(txtTugas);

        lblUTS = new JLabel("Nilai UTS");
        lblUTS.setBounds(30, 150, 120, 25);
        add(lblUTS);

        txtUTS = new JTextField();
        txtUTS.setBounds(170, 150, 200, 25);
        add(txtUTS);

        lblUAS = new JLabel("Nilai UAS");
        lblUAS.setBounds(30, 190, 120, 25);
        add(lblUAS);

        txtUAS = new JTextField();
        txtUAS.setBounds(170, 190, 200, 25);
        add(txtUAS);

        btnHitung = new JButton("Hitung Nilai");
        btnHitung.setBounds(140, 240, 150, 35);
        add(btnHitung);

        hasil = new JTextArea();
        hasil.setBounds(50, 300, 330, 120);
        hasil.setEditable(false);
        add(hasil);

        btnHitung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String nama = txtNama.getText();
                String nim = txtNim.getText();

                double tugas = Double.parseDouble(txtTugas.getText());
                double uts = Double.parseDouble(txtUTS.getText());
                double uas = Double.parseDouble(txtUAS.getText());

                double nilaiAkhir =
                        (tugas * 0.20) +
                        (uts * 0.35) +
                        (uas * 0.45);

                char grade;

                if (nilaiAkhir >= 85) {
                    grade = 'A';
                } else if (nilaiAkhir >= 75) {
                    grade = 'B';
                } else if (nilaiAkhir >= 65) {
                    grade = 'C';
                } else if (nilaiAkhir >= 50) {
                    grade = 'D';
                } else {
                    grade = 'E';
                }

                String status;
                if (nilaiAkhir >= 60) {
                    status = "LULUS";
                } else {
                    status = "TIDAK LULUS";
                }

                hasil.setText(
                        "=== HASIL PENILAIAN ===\n" +
                        "Nama        : " + nama + "\n" +
                        "NIM         : " + nim + "\n" +
                        "Nilai Akhir : " + String.format("%.2f", nilaiAkhir) + "\n" +
                        "Grade       : " + grade + "\n" +
                        "Status      : " + status
                );
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new PenilaianMahasiswaGUI();
    }
}