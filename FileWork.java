import com.sun.source.tree.Tree;

import java.io.IOException;

public interface FileWork {
    void saveFile(TreePerson tree, String path) throws IOException;
    TreePerson loadTree(String path) throws IOException, ClassNotFoundException;
}
