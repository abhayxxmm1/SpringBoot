<!-- Pagination -->
<nav>
    <ul class="pagination justify-content-center">

        <!-- Previous -->
        <li class="page-item ${currentPage == 0 ? 'disabled' : ''}">
            <a class="page-link" href="dis?page=${currentPage - 1}">
                Previous
            </a>
        </li>

        <!-- Page Numbers -->
        <c:forEach begin="0" end="${totalPages - 1}" var="i">
            <li class="page-item ${i == currentPage ? 'active' : ''}">
                <a class="page-link" href="dis?page=${i}">
                    ${i + 1}
                </a>
            </li>
        </c:forEach>

        <!-- Next -->
        <li class="page-item ${currentPage == totalPages - 1 ? 'disabled' : ''}">
            <a class="page-link" href="dis?page=${currentPage + 1}">
                Next
            </a>
        </li>

    </ul>
</nav>
