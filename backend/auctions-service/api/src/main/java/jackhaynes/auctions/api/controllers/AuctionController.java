package jackhaynes.auctions.api.controllers;

import jackhaynes.auctions.api.dtos.AuctionDto;
import jackhaynes.auctions.api.services.AuctionService;
import jakarta.validation.Valid;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
public class AuctionController {
    private final AuctionService auctionService;

    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    @GetMapping("/auctions")
    public List<AuctionDto> getAuctions(@RequestParam(value = "date", required = false)
                                            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
                                            LocalDateTime date) {
        return auctionService.getAuctions(date);
    }

    @Validated
    @PostMapping("/auctions")
    public void createAuction(@Valid @RequestBody AuctionDto auction) {
        auctionService.createAuction(auction);
    }

    @Validated
    @PutMapping("/auctions/{auctionId}")
    public void updateAuction(@PathVariable UUID auctionId,
                              @Valid @RequestBody AuctionDto auction) {
        auctionService.updateAuction(auction);
    }

    @GetMapping("/auctions/{auctionId}")
    public AuctionDto getAuction(@PathVariable UUID auctionId) {
        return auctionService.getAuction(auctionId);
    }


}
