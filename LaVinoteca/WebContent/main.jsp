<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row">
	<div class="col-md-6">
		<section>
			<h3>Novedades</h3>
			<c:forEach var="newVino" items="${requestScope.novedades}">
				<article class="row">
					<h4>${newVino.nombre}</h4>
					<div class="col-md-3">
						<div>
							<img src="${newVino.imagen}" alt="wine-bottle" height="150" />
						</div>
						<div class="botones-enviar-carrito">
							<form action="Agregar">

								<input type="hidden" value="${topVino.id}" name="id" id="id" /> 
								<input	name="cantidad" size="2" class="spinner cantidad-productos" />
								
								<div class="boton-enviar">
								    <input	type="submit" class="enviar-carrito" value="" />
                                </div>
							</form>
						</div>
					</div>
					
					<div class="col-md-9">
						<p>${newVino.descripcion}</p>

					</div>
				</article>
			</c:forEach>
		</section>
	</div>

	<div class="col-md-6">
		<section>
			<h3>M&aacute;s vendidos</h3>
			<c:forEach var="topVino" items="${requestScope.masVendido}">
				<article class="row">
					<h4>${topVino.nombre}</h4>
					<div class="col-md-3">
						<div>
							<img src="${topVino.imagen}" alt="wine-bottle" height="150" />
						</div>

						<div class="botones-enviar-carrito">
							<form action="Agregar">
								<input type="hidden" value="${topVino.id}" /> <input
									name="cantidad" size="2" class="spinner cantidad-productos" /> <input
									type="submit" class="enviar-carrito" value="" />
							</form>
						</div>
					</div>
					<div class="col-md-9">
						<p>${topVino.descripcion}</p>
					</div>
				</article>
			</c:forEach>
		</section>
	</div>
</div>