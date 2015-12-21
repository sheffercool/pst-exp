package org.pipoware.pst.exp;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Test;

/**
 *
 * @author Franck Arnulfo
 */
public class MessageStoreTest {

  @Test
  public void testPSTPages() throws URISyntaxException, IOException {
    Path path = Paths.get(getClass().getResource("/pstsdk/sample1.pst").toURI());
    PSTFile pstFile = new PSTFile(path);
    NDB ndb = new NDB(pstFile, pstFile.getHeader());
    PC pc = ndb.getPCFromNID(SpecialInternalNID.NID_MESSAGE_STORE);
    System.out.println("PC:" + ToStringHelper.formatMultiline(pc.toString()));
  }
}
