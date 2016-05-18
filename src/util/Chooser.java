package util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author leonel.santos
 */
public class Chooser {

    public JFileChooser fileChooser = new JFileChooser();
    public String arquivoSelecionado;
    public String pathelecionado;
    public String parent;
    public String extensao;
    public ArrayList arquivos;
    private ArrayList filto;
    public int qtArquivos;
    public int returnValue;

    public Chooser(ArrayList listaFiltros) {

        listaFiltros.stream().forEach((listaFiltro) -> {
            fileChooser.setFileFilter(new FileNameExtensionFilter(listaFiltro.toString(), listaFiltro.toString()));
        });

        fileChooser.setDialogTitle("Buscar Arquvos de Dados");

        returnValue = fileChooser.showOpenDialog(null);
        //tentativa de manter diretorio na memoria
        // fileChooser.setCurrentDirectory( new File(fileChooser.getSelectedFile().getAbsolutePath()));

        if (returnValue == JFileChooser.APPROVE_OPTION) {

            File selectedFile = fileChooser.getSelectedFile();
            arquivoSelecionado = selectedFile.getName();
            pathelecionado = selectedFile.getPath();
            parent = (String) selectedFile.getParentFile().toString();
            File f = new File(parent);

            qtArquivos = f.listFiles().length;
            extensao = arquivoSelecionado.substring(arquivoSelecionado.lastIndexOf('.') + 1);

            File[] files = f.listFiles();
            arquivos = new ArrayList();
            arquivos.addAll(Arrays.asList(files));
            //arquivos.addAll(Arrays.asList(files));
            
            
         
            

        }

    }

}
