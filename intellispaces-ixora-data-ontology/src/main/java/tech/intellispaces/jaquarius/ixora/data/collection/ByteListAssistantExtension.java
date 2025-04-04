package tech.intellispaces.jaquarius.ixora.data.collection;

import tech.intellispaces.ixora.data.collection.ByteListDomain;
import tech.intellispaces.ixora.data.collection.UnmovableByteListHandle;
import tech.intellispaces.jaquarius.annotation.AssistantExtension;

@AssistantExtension(ByteListDomain.class)
public interface ByteListAssistantExtension {

  UnmovableByteListHandle create(byte value1, byte value2);

  UnmovableByteListHandle create(byte value1, byte value2, byte value3);

  UnmovableByteListHandle handleOf(byte[] array);

  UnmovableByteListHandle handleOf(java.util.List<Byte> list);
}

