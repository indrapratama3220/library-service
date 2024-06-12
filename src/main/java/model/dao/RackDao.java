package model.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.entity.Rack;

import java.util.Map;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RackDao {
    private Map<String, Rack> rackMap;
}
