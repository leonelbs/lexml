/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import java.time.OffsetDateTime;

/**
 *
 * @author Leonel.Santos
 */
public class ConverteData implements Converter {

    @Override
    public void marshal(Object o, HierarchicalStreamWriter writer, MarshallingContext mc) {

        OffsetDateTime date = (OffsetDateTime) o;
        writer.setValue(date.toString());
    }

    @Override
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext uc) {

        String tx = null;
        OffsetDateTime data = OffsetDateTime.parse(reader.getValue());
        // LocalDateTime data = LocalDateTime.parse(reader.getValue().substring(0, 19));
        return data;
    }

    @Override
    public boolean canConvert(Class type) {
        return type.equals(OffsetDateTime.class);
    }
}
