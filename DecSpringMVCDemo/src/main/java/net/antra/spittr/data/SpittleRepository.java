package net.antra.spittr.data;

import net.antra.spittr.model.Spittle;
import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
