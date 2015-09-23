package org.pipoware.pst.exp;

import org.junit.Assert;
import org.junit.Test;
import static org.pipoware.pst.exp.Header.PST_TYPE.UNICODE;

/**
 *
 * @author Franck
 */
public class BlockTest {
  
  @Test
  public void testDiskSize() {
    Assert.assertEquals(192, Block.diskSize(156, UNICODE));
    Assert.assertEquals(320, Block.diskSize(276, UNICODE));
    Assert.assertEquals(192, Block.diskSize(124, UNICODE));
  }
  
  @Test
  public void testSignature() {
    Assert.assertEquals(0x4C04, Block.computeSig(19456, 0x4));
    Assert.assertEquals(0x8DD8, Block.computeSig(36160, 0x98));
    Assert.assertEquals(0x2D7A, Block.computeSig(142336, 0x178));
  }
}