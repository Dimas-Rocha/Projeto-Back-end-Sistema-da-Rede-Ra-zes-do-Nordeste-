package dto;



import enums.CanalPedido;
import lombok.Data;

import java.util.List;


@Data
public class PedidoRequest {


    private Long clienteId;


    private Long unidadeId;


    private CanalPedido canalPedido;


    private List<ItemPedidoRequest> itens;


}