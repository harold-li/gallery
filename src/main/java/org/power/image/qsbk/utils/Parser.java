package org.power.image.qsbk.utils;

import java.io.IOException;
import java.util.List;


public interface Parser {

    public List<Image> parse(String url) throws IOException;

}
