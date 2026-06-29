package repository;

public interface PedidoRepository
        extends JpaRepository<Pedido,Long>{


    List<Pedido>
    findByCanalPedido(
            CanalPedido canal);

    List<Pedido>
    findByCanalPedido(
            CanalPedido canalPedido
    );
}
